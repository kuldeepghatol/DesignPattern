public class Student {

    private int id;
    private String name;
    private int gradeYear;
    private long mobileNumber;
    private String emailId;

    public Student(int id,
                   String name,
                   int gradeYear,
                   int mobileNumber,
                   String emailId) {
        this.id = id;
        this.name = name;
        this.gradeYear = gradeYear;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradeYear=" + gradeYear +
                ", mobileNumber=" + mobileNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private int id;
        private String name;
        private int gradeYear;
        private int mobileNumber;
        private String emailId;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder gradeYear(int gradeYear){
            this.gradeYear =  gradeYear;
            return this;
        }
        public Builder mobileNumber(int mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public Builder emailId(String emailId){
            this.emailId = emailId;
            return this;

        }


        private void validate(){
            if (name == null) {
                throw new InvalidNameException();
            }
        }

        public Student build() {
            validate();
            return new Student(id,name,gradeYear,mobileNumber,emailId);
        }
    }

}
