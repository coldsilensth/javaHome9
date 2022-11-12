import java.util.Arrays;

public class Keyboard {
      boolean backlight;
      boolean numberRight;
      String[] arrayKey = {"RUS", "ENG"};


      public Keyboard(boolean backlight, boolean numberRight) {
            this.backlight = backlight;
            this.numberRight = numberRight;
      }

      @Override
      public String toString() {
            return "Keyboard{" +
                    "arrayKey=" + Arrays.toString(arrayKey) +
                    ", backlight=" + backlight +
                    ", numberRight=" + numberRight +
                    '}';
      }
}
