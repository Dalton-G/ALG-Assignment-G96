package Benchmark;

import java.lang.instrument.Instrumentation;
//-javaagent:D:\ALG-Assignment-G96\out\artifacts\unnamed\unnamed.jar
public class SpaceComplexityAgent {
    private static Instrumentation instrumentation;

    public static void premain(String agentArgs, Instrumentation inst) {
        instrumentation = inst;
        System.out.println("Space Complexity Agent Initialized.");
    }

    public static long getObjectSize(Object obj) {
        if (instrumentation == null) {
            throw new IllegalStateException("Agent not initialized.");
        }
        return instrumentation.getObjectSize(obj);
    }
}


