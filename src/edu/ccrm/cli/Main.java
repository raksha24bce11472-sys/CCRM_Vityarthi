// src/edu/ccrm/cli/Main.java
package edu.ccrm.cli;

import edu.ccrm.config.AppConfig;
import edu.ccrm.domain.Course;
import edu.ccrm.domain.CourseCode;
import edu.ccrm.domain.Semester;

public class Main {
    public static void main(String[] args) {
        var cfg = AppConfig.getInstance();
        System.out.println("CCRM starting with dataDir=" + cfg.getDataDir());

        var cc = new CourseCode("CS101");
        var course = new Course.Builder()
                .code(cc).title("Intro to CS").credits(3)
                .semester(Semester.FALL).department("CSE")
                .build();
        System.out.println(course);
    }
}