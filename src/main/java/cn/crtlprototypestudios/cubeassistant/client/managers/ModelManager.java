package cn.crtlprototypestudios.cubeassistant.client.managers;

import java.io.IOException;

public class ModelManager {
    public static void InstallModel(Model model) throws IOException {
        Process install = Runtime.getRuntime().exec(String.format("ollama pull %s", model.toString()));
//        install
    }
}
