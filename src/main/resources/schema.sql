DROP TABLE IF EXISTS genders CASCADE;
DROP TABLE IF EXISTS roles CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS auth CASCADE;

-- 性別テーブル
CREATE TABLE genders (
	id INTEGER NOT NULL PRIMARY KEY,
	name VARCHAR(1) NOT NULL
);

-- 権限テーブル
CREATE TABLE roles (
	code INTEGER NOT NULL DEFAULT 1 PRIMARY KEY,
	name VARCHAR(10) NOT NULL
);

-- 利用者テーブル
CREATE TABLE users (
	id SERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	gender INTEGER NULL,
	email VARCHAR(255) NOT NULL UNIQUE,
	role INTEGER NOT NULL DEFAULT 0 CHECK(role < 2) -- 0:システム管理者、1:一般ユーザ
);

-- 認証テーブル
CREATE TABLE auth (
	id SERIAL NOT NULL PRIMARY KEY,
	role INTEGER NOT NULL,
	handler VARCHAR(100) NOT NULL,
	email VARCHAR(255) NOT NULL UNIQUE,
	password VARCHAR(255) NOT NULL UNIQUE
);