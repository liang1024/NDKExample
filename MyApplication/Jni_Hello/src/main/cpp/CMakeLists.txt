cmake_minimum_required(VERSION 3.4.1)

add_library(hellojni SHARED
            hellojni.c)

# Include libraries needed for hello-jni lib
target_link_libraries(hellojni
                      android
                      log)
