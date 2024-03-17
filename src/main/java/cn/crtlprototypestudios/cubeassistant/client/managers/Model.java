package cn.crtlprototypestudios.cubeassistant.client.managers;

public enum Model {
    Gemma7B("gemma:7b"),
    Gemma2B("gemma:2b");

    private final String label;

    private Model(String s) {
        this.label = s;
    }

    @Override
    public String toString(){
        return this.label;
    }
}
