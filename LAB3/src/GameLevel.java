interface GameLevel extends Cloneable {
  GameLevel clone();

  void configure();
}

// Concrete class
class BasicLevel implements GameLevel {

  @Override
  public GameLevel clone() {
    return new BasicLevel();
  }

  @Override
  public void configure() {
    System.out.println("Basic Level");
  }
}

// Concrete class
class AdvancedLevel implements GameLevel {

  @Override
  public GameLevel clone() {
    return new AdvancedLevel();
  }

  @Override
  public void configure() {
    System.out.println("Advanced Level");
  }
}

class LevelDesignTool {

  public static void main(String[] args) {

    GameLevel basicLevelPrototype = new BasicLevel();
    GameLevel basic = basicLevelPrototype.clone();
    basic.configure();

    GameLevel advancedLevelPrototype = new AdvancedLevel();
    GameLevel advanced = advancedLevelPrototype.clone();
    advanced.configure();

  }
}