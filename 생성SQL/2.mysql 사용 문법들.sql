use myblog;

select * from users;
commit;

ALTER TABLE users MODIFY COLUMN id int AUTO_INCREMENT ;

alter table users  change createdDate created_date date;

﻿ALTER TABLE users MODIFY id int AUTO_INCREMENT PRIMARY KEY;﻿




