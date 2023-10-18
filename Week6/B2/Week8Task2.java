import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    /**
     * Hien.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * Hien.
     */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException("Lỗi Null Pointer");
    }

    /**
     * Hien.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * Hien.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
    }

    /**
     * Hien.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * Hien.
     */
    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException("Lỗi Arithmetic");
    }


    /**
     * Hien.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * Hien.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    /**
     * Hien.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * Hien.
     */
    public void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }
}
