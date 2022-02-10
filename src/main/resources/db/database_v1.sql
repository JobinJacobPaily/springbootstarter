CREATE TABLE tbl_user (
    user_id SERIAL PRIMARY KEY,
    user_name VARCHAR(25) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created BIGINT NOT NULL,
    updated BIGINT NOT NULL
);

CREATE TABLE tbl_app_info (
     app_id SERIAL PRIMARY KEY,
     device_id VARCHAR(255) NOT NULL,
     created BIGINT NOT NULL,
     updated BIGINT NOT NULL
);

CREATE TABLE tbl_user_login_info (
     user_login_id SERIAL PRIMARY KEY,
     user_id INT NOT NULL,
     app_id INT NOT NULL,
     token VARCHAR(255)  NOT NULL,
     created BIGINT NOT NULL,
     updated BIGINT NOT NULL
);

/** FOREIGN KEYS  */

ALTER TABLE tbl_user_login_info
ADD CONSTRAINT tbl_user_tbl_user_login_info_FOR_KEY
FOREIGN KEY(user_id)
REFERENCES tbl_user (user_id);

ALTER TABLE tbl_app_info
ADD CONSTRAINT tbl_app_info_tbl_user_login_info_FOR_KEY
FOREIGN KEY (app_id)
REFERENCES tbl_app_info (app_id);