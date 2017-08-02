CREATE TABLE IF NOT EXISTS users (
	user_id SERIAL,
	nickname VARCHAR(50) NOT NULL,
	PRIMARY KEY (user_id)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS records (
	rec_id SERIAL,
	user_id BIGINT UNSIGNED NOT NULL,
	rec_title VARCHAR(200) NOT NULL,
	rec_body TEXT NOT NULL,
	crt_date TIMESTAMP NOT NULL,
	mdf_date TIMESTAMP NOT NULL,
	INDEX u_id (user_id),
	PRIMARY KEY (rec_id),
	CONSTRAINT FOREIGN KEY (user_id) REFERENCES users (user_id)
	    ON DELETE CASCADE ON UPDATE CASCADE
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS comments (
	comment_id SERIAL,
	user_id BIGINT UNSIGNED NOT NULL,
	rec_id BIGINT UNSIGNED NOT NULL,
	comment_body TEXT NOT NULL,
	crt_date TIMESTAMP NOT NULL,
	mdf_date TIMESTAMP NOT NULL,
	INDEX u_id(user_id),
	INDEX r_id(rec_id),
	PRIMARY KEY (comment_id),
	CONSTRAINT FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE,
	CONSTRAINT FOREIGN KEY (rec_id) REFERENCES records (rec_id) ON DELETE CASCADE
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS tags (
	tag_id SERIAL,
	tag_name VARCHAR(50) NOT NULL,
	PRIMARY KEY (tag_id)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS tag_rec_ref (
	tr_id SERIAL,
	tag_id BIGINT UNSIGNED NOT NULL,
	rec_id BIGINT UNSIGNED NOT NULL,
	INDEX t_id(tag_id),
	INDEX r_id(rec_id),
	PRIMARY KEY (tr_id),
	CONSTRAINT FOREIGN KEY (tag_id) REFERENCES tags (tag_id) ON DELETE CASCADE,
	CONSTRAINT FOREIGN KEY (rec_id) REFERENCES records (rec_id) ON DELETE CASCADE
) Engine=InnoDB;