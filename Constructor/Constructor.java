class Constructor {
  String text;

  // Always the class name
  Constructor() {
    text = "Set in the Constructor";
  }

  String getText() {
    return text;
  }

  public static void main(String[] args) {
    Constructor inst = new Constructor();
    String retrievedText = inst.getText();
    System.out.println(retrievedText);
  }
}
