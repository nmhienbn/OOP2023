public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor.
     */
    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor.
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor.
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Get student's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set student's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get student's id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set student's id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get student's group.
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * Set student's group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Get student's email.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set student's email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get student's info.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}