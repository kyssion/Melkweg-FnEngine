package org.mintflow.test;

public class BaseTestUtil {
    public final static String NAME_SPACE="test_namespace";
    public final static String SYNC_PROCESS_NAME="sync_test_process";
    public final static String ASYNC_PROCESS_NAME="async_test_process";

    public static void main(String[] args) {
        for(int a=0;a<26;a++){
            char i = (char) ('A'+a);
            System.out.print("|"+"'"+i+"'");
        }
    }
}
