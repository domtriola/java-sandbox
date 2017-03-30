public class Static {
  static String staticText = "I'm accessible without instantiating my class";
  String text = "I'm only available inside of my class";

  String getText() {
    return text;
  }

  String getStaticText() {
    return staticText;
  }

  static String getTextStatically() {
    return staticText;
  }

  public static void main(String[] args) {
    Static staticInstance = new Static();
    String retrievedText = staticInstance.getText();
    String retrievedStaticText = staticInstance.getStaticText();
    String retrievedStatically = getTextStatically();
    System.out.println(retrievedText);
    System.out.println(retrievedStaticText);
    System.out.println(retrievedStatically);
  }
}
