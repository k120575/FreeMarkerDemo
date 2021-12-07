Drop TABLE IF EXISTS 'member';
CREATE TABLE `member` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(45) DEFAULT NULL,
    `password` varchar(45) DEFAULT NULL,
    `level` int DEFAULT NULL,
    `score` decimal(10,2) DEFAULT NULL,
    `create_time` datetime DEFAULT NULL,
    `create_user` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
