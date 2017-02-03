cmake_minimum_required(VERSION 3.4.1)

add_library(datatype SHARED
            jni.c)

# Include libraries needed for hello-jni lib
target_link_libraries(datatype
                      android
                      log)