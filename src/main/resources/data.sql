-- 性別テーブルのマスタデータ登録
INSERT INTO genders (id, name) VALUES (1, '男');
INSERT INTO genders (id, name) VALUES (2, '女');

-- 権限テーブルのマスタデータ登録
INSERT INTO roles (code, name) VALUES (0, 'システム管理者');
INSERT INTO roles (code, name) VALUES (1, '一般ユーザ');

-- ユーザテーブルのサンプルレコード
INSERT INTO users (name, role, email) VALUES ('管理者', 0, 'info@hoge.com');
INSERT INTO users (name, role, gender, email) VALUES ('ユーザ1', 1, 1, 'user01@hoge.com');
INSERT INTO users (name, role, gender, email) VALUES ('ユーザ2', 1, 2, 'user02@hoge.com');

-- 認証テーブルのサンプルレコード
INSERT INTO auth (email, role, password, handler) VALUES ('info@hoge.com', 0, 'pass', '権現様');
INSERT INTO auth (email, role, password, handler) VALUES ('user01@hoge.com', 1, 'pass01', 'ユーザ1');
INSERT INTO auth (email, role, password, handler) VALUES ('user02@hoge.com', 1, 'pass02', 'レギオン');
