public class LeftTriangle{
        public static void main(String[] arg){
            int trinagleRow;
            int triangleColumn;
            int rowCounter = 10;
            for(trinagleRow=0; trinagleRow<rowCounter; trinagleRow++)
            {
                for(triangleColumn=0; triangleColumn<=trinagleRow; triangleColumn++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
