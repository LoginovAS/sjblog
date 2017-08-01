CREATE TABLE IF NOT EXISTS users (
	user_id SERIAL NOT NULL AUTO_INCREMENT,
	nickname VARCHAR(50) NOT NULL,
	PRIMARY KEY (user_id)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS records (
	rec_id SERIAL NOT NULL AUTO_INCREMENT,
	user_id SERIAL NOT NULL,
	rec_title VARCHAR(200) NOT NULL,
	rec_body TEXT NOT NULL,
	crt_date TIMESTAMP NOT NULL,
	mdf_date TIMESTAMP NOT NULL,
	PRIMARY KEY (rec_id),
	FOREIGN KEY (user_id) REFERENCES users (user_id)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS comments (
	comment_id SERIAL NOT NULL AUTO_INCREMENT,
	user_id SERIAL NOT NULL,
	rec_id SERIAL NOT NULL,
	comment_body TEXT NOT NULL,
	crt_date TIMESTAMP NOT NULL,
	mdf_date TIMESTAMP NOT NULL,
	PRIMARY KEY (comment_id),
	FOREIGN KEY (user_id) REFERENCES users (user_id),
	FOREIGN KEY (rec_id) REFERENCES records (rec_id)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS tags (
	tag_id SERIAL NOT NULL AUTO_INCREMENT,
	tag_name VARCHAR(50) NOT NULL,
	PRIMARY KEY (tag_id)
) Engine=InnoDB;

CREATE TABLE IF NOT EXISTS tag_rec_ref (
	tr_id SERIAL NOT NULL AUTO_INCREMENT,
	tag_id SERIAL NOT NULL,
	rec_id SERIAL NOT NULL,
	PRIMARY KEY (tr_id),
	FOREIGN KEY (tag_id) REFERENCES tags (tag_id),
	FOREIGN KEY (rec_id) REFERENCES records (rec_id)
) Engine=InnoDB;