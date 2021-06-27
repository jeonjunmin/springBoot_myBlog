select database();
select USER();
show databases;

use myblog;

select * from users;

CREATE TABLE `users` (
    `id` int(100) NOT NULL,
    `username` varchar(30) NOT NULL,
    `password` varchar(100) NOT NULL,
    `email` varchar(50) NOT NULL,
    `role` varchar(10) DEFAULT NULL,
    `createDate` date DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;