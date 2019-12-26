//package com.zhaochenxu.cn.thread;
//
//import java.lang.management.ManagementFactory;
//import java.lang.management.ThreadInfo;
//import java.lang.management.ThreadMXBean;
//
//public class ThreadDemo01 {
//
//    public static void main(String[] args) {
//
//
//        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
//        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
//        for (ThreadInfo threadInfos: threadInfos
//             ) {
//            System.out.println("["+threadInfos.getThreadId()+"]"+threadInfos.getThreadName());
//
//        }
//    }
//}
