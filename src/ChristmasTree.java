public class ChristmasTree{

   public static void main(String[] args) {

      new ChristmasTree().printTree(20, true);

   }

   public void printTree(int heightTree, boolean toDecorate){
      int width = heightTree * 2;
      char[] stars = new char[width];
      int rEl = ((width) / 2);
      int lEl = ((width) / 2);
      //Option 1 - I like it more than 2
      for (int i = 0; i < heightTree; i++) {
         for (int j = 0; j < width; j++) {
            if (j > lEl && j < rEl){
               if (toDecorate && (Math.random() * 10) > 8.5){
                  stars[j] = 'o';
               }else if (toDecorate && (Math.random() * 10) < 1.5){
                  stars[j] = '+';
               }else{
                  stars[j] = '*';
               }
            }else{
               stars[j] = ' ';
            }
         }
         if (i == heightTree - 1){
            for (int k = 0; k < width; k++) {
               stars[k] = ' ';
            }
            stars[(width / 2)] = '#';
         }
         rEl++;
         lEl--;
         System.out.println(stars);
      }
      //Option 2 (without decoration)
      /*
      for (int i = 0; i < height; i++) {
         for (int j = 0; j < width; j++) {
            if (i == height - 1){
               stars[j] = ' ';
               stars[(width-1)/2] = '#';
            }else{
               stars[j] = ' ';
               for (int el = (lEl - i); el <= (rEl + i); el++) {
                  stars[el] = '*';
               }
            }
         }
         System.out.println(stars);
      }
      */

   }
}
