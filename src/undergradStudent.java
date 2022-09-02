public class undergradStudent extends student implements major{
    //Inheritance is to use class hierarchies to enable the reuse of functionality
    
        private Double gpa;
        private Integer creditsEarned;
        private String Major;

        public undergradStudent(String firstName, String lastName, String schoolName, Double gpa, Integer creditsEarned,
        String Major){
            super(firstName,lastName,schoolName);
            this.gpa = gpa;
            this.creditsEarned = creditsEarned;
            this.Major = Major;
        }  
        public Double getGpa() {
            return gpa;
        }
        public void setGpa(Double gpa) {
            this.gpa = gpa;
        }
        public Integer getCreditsEarned() {
            return creditsEarned;
        }
        public void setCreditsEarned(Integer creditsEarned) {
            this.creditsEarned = creditsEarned;
        }
        public String getMajor() {
            return Major;
        }
        public void setMajor(String Major) {
            this.Major = Major;
        }
        //Polymorphism is to override methods to change behavior
        @Override
        public Integer creditsRemaining(Integer creditsRequired) {
            return creditsRequired - creditsEarned;
        }
        
        @Override
        public String greeting() {
            return super.greeting() + " My major is " + Major + ". My gpa is " + gpa +
            " and I have earned " + creditsEarned + " credits." ;
        }
        @Override
        public boolean isMajorComplete(Integer creditsRequired) {
            return creditsRemaining(creditsRequired) == 0;
        }

        
        
    }
    

