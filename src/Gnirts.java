public class Gnirts implements CharSequence {

   private String reverseLine = "";
   private String line = "";
   private char[] lineChar;

   public Gnirts(String line) {
      this.line = line;
      for (int i = line.length() - 1; i >= 0; i--) {
         this.reverseLine += line.charAt(i);
      };
      System.out.println(this.reverseLine);
   }

   @Override
   public int length() {
      return this.line.length();
   }

   @Override
   public char charAt(int index) {
      this.lineChar = this.line.toCharArray();
      return this.lineChar[index-1];
   }

   @Override
   public CharSequence subSequence(int start, int end) {
      this.lineChar = this.line.toCharArray();
      char[] partLine = new char[end - start];
      int idx = 0;
      if (start >= this.lineChar.length || end > this.lineChar.length){
         return "";
      }
      for (int i = start-1; i < end-1; i++) {
         partLine[idx] = this.lineChar[i];
         System.out.println(partLine[idx]);
         idx++;
      }
      return new String(partLine);
   }

   public static void main(String[] args) {
      Gnirts gn = new Gnirts("Hello-My-World");
//      System.out.println(gn.charAt(5));
      System.out.println(gn.subSequence(2,7));
   }
}
