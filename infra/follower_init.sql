CHANGE MASTER TO
    MASTER_HOST='localhost',
    MASTER_USER='replication',
    MASTER_PASSWORD='replica',
    MASTER_LOG_FILE='mysql-bin.000003',
    MASTER_LOG_POS=157;