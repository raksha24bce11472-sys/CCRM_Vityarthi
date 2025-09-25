// ccrm/src/main/java/edu/ccrm/config/AppConfig.java
package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public final class AppConfig {
    private static volatile AppConfig INSTANCE;

    private Path dataDir;
    private Path exportsDir;
    private Path backupsDir;

    private AppConfig() {
        this.dataDir = Paths.get("test-data");
        this.exportsDir = Paths.get("exports");
        this.backupsDir = Paths.get("backups");
    }

    public static AppConfig getInstance() {
        AppConfig local = INSTANCE;
        if (local == null) {
            synchronized (AppConfig.class) {
                local = INSTANCE;
                if (local == null) {
                    local = new AppConfig();
                    INSTANCE = local;
                }
            }
        }
        return local;
    }

    public Path getDataDir() { return dataDir; }
    public Path getExportsDir() { return exportsDir; }
    public Path getBackupsDir() { return backupsDir; }

    public void setDataDir(Path dataDir) { this.dataDir = Objects.requireNonNull(dataDir, "dataDir"); }
    public void setExportsDir(Path exportsDir) { this.exportsDir = Objects.requireNonNull(exportsDir, "exportsDir"); }
    public void setBackupsDir(Path backupsDir) { this.backupsDir = Objects.requireNonNull(backupsDir, "backupsDir"); }
}
