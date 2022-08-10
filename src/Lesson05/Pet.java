package Lesson05;

abstract class Pet {
    protected String name="";
    protected String voice ="";
    abstract void showName();
    abstract void voice();

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
