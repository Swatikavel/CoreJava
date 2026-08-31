package Access_Modifier;


    // Whatever private we can not Access it Outside the Class
class student {
    private int marks = 20;

        public int getMarks() {
            return marks;
        }


            public static void main (String[] args){
                student s = new student();
                System.out.println(s.getMarks());            }
        }








