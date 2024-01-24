

import java.util.ArrayList;
import java.util.List;

public class Week10 {
    private String packages = "";
    private final ArrayList<String> libraries = new ArrayList<String>();
    private final ArrayList<String> classes = new ArrayList<String>();
    private final ArrayList<String> staticMethods = new ArrayList<String>();

    /**
     * Return a list of all the functions in the file.
     *
     * @param fileContent the content of the file
     * @return a list of all the functions in the file
     */
    List<String> getAllFunctions(String fileContent) {
        String temp = removeAllComments(setFileContentToOneLine(fileContent));
        String str = temp.replace("{", "{\n");
        String[] lines = str.split("\n");
        List<String> staticCode = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith("import")) {
                String[] importLines = line.trim().split(" ");
                libraries.add(importLines[importLines.length - 1].replace(";", ""));
            } else if (line.startsWith("package")) {
                String[] packageLines = line.trim().split(" ");
                packages = packageLines[packageLines.length - 1].replace(";", "");
            } else if (line.contains("static")) {
                staticCode.add(line);
            } else if (line.contains("class")) {
                handleClass(line, "class");
            } else if (line.contains("enum")) {
                handleClass(line, "enum");
            } else if (line.contains("interface")) {
                handleClass(line, "interface");
            }
        }
        for (String method : staticCode) {
            handleStaticMethod(method);
        }
        return staticMethods;
    }

    /**
     * Return a list of all the libraries in the file.
     */
    private void handleStaticMethod(String line) {
        if (line.contains("=") || line.contains("\"")) {
            return;
        }
        int index = line.indexOf("(");
        if (index == -1) {
            return;
        }

        int index2 = line.indexOf(")", index + 1);
        if (index2 == -1) {
            return;
        }

        String methodName = line.substring(line.substring(0, index).lastIndexOf(" ") + 1, index);

        // no parameter
        if (index2 - index == 1) {
            staticMethods.add(methodName.concat("()"));
            return;
        }

        String[] parameters = line.substring(index + 1, index2).split(", ");
        StringBuilder method = new StringBuilder(methodName.concat("("));
        for (String parameter : parameters) {
            String str = parameter.substring(0, parameter.lastIndexOf(" "))
                    .replace("final ", "").trim();
            String param = handleParameters(str);
            method = new StringBuilder(method.toString().concat(param));
            method.append(",");
        }
        method.deleteCharAt(method.length() - 1);
        method.append(")");
        staticMethods.add(method.toString());
    }

    /**
     * Return a list of all the libraries in the file.
     */
    private String handleParameters(String str) {
        if (str.contains("...")) {
            return findLib(str.replace("...", ""));
        }
        if (str.contains("[]")) {
            int index = str.indexOf("[]");
            return findLib(str.replace("[]", "")) + str.substring(index);
        }
        if (!str.contains("<")) {
            return findLib(str);
        }
        int index = str.indexOf("<");
        StringBuilder fix = new StringBuilder(findLib(str.substring(0, index)) + "<");
        String[] list = str.substring(index + 1, str.length() - 1).split(", ");
        for (String s : list) {
            if (s.startsWith("?")) {
                fix = new StringBuilder(fix.toString().concat(s));
            } else {
                fix.append(findLib(s));
            }
            fix.append(",");
        }
        return fix.deleteCharAt(fix.length() - 1).toString().concat(">");
    }

    /**
     * Return a list of all the libraries in the file.
     */
    private String findLib(String str) {
        for (String s : classes) {
            if (s.endsWith(str)) {
                return s;
            }
        }

        for (String s : libraries) {
            if (s.endsWith("." + str)) {
                return s;
            }
        }

        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' && str.length() > 1) {
            if (str.contains("API")) {
                return "com.nordstrom.common.jdbc.utils." + str;
            } else {
                return "java.lang." + str;
            }
        }
        return str;
    }

    /**
     * Return a list of all the libraries in the file.
     */
    private String removeAllComments(String s) {
        StringBuilder tmp = new StringBuilder(s);
        int index = tmp.indexOf("//");
        while (index != -1) {
            int index2 = tmp.indexOf("\n", index);
            if (index2 == -1) {
                break;
            }
            tmp.delete(index, index2);
            index = tmp.indexOf("//");
        }
        index = tmp.indexOf("/*");
        while (index != -1) {
            int index2 = tmp.indexOf("*/", index);
            if (index2 == -1) {
                break;
            }
            tmp.delete(index, index2 + 3);
            index = tmp.indexOf("/*");
        }
        return tmp.toString();
    }

    /**
     * Return a list of all the libraries in the file.
     */
    private String setFileContentToOneLine(String fileContent) {
        StringBuilder tmp = new StringBuilder(fileContent);
        int index = tmp.indexOf("(");
        while (index != -1) {
            int index2 = tmp.indexOf(")", index);
            for (int i = index2; i > index; i--) {
                if (tmp.charAt(i) == '\n') {
                    tmp.deleteCharAt(i);
                }
            }
            index = tmp.indexOf("(", index + 2);
        }
        return tmp.toString();
    }

    /**
     * Return a list of all the libraries in the file.
     */
    private void handleClass(String line, String classType) {
        int index = line.indexOf(classType + " ") + 6;
        int index2 = line.indexOf(" ", index);
        if (index2 == -1) {
            return;
        }
        String className = line.substring(index, index2).trim();
        String[] string = className.split("<");
        classes.add(packages + "." + string[0]);
    }
}
