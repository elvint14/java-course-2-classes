package org.course.part04.lesson39.constant;

public enum Directory {
    RESOURCE_DIR("src/main/java/org/course/part04/lesson39/resource/"),
    TEMPLATE_DIR("src/main/java/org/course/part04/lesson39/resource/templates"),
    CSS_DIR("src/main/java/org/course/part04/lesson39/resource/css"),
    JS_DIR("src/main/java/org/course/part04/lesson39/resource/js"),
    IMAGE_DIR("src/main/java/org/course/part04/lesson39/resource/images");

    private final String path;

    Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
