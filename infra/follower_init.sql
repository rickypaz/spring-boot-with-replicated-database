CHANGE MASTER TO
    MASTER_HOST='mysql-master',
    MASTER_USER='replication',
    MASTER_PASSWORD='replica',
    MASTER_LOG_FILE='mysql-bin.000007',
    MASTER_LOG_POS=157;