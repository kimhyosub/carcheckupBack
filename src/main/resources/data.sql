INSERT INTO CARS (make, model, car_year, status) VALUES ('Tesla', 'Model 3', 2021, 'Pass');

-- 제조사 데이터 추가
INSERT INTO MANUFACTURERS (name, country) VALUES ('Tesla', 'United States');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Hyundai', 'South Korea');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Kia', 'South Korea');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Toyota', 'Japan');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Honda', 'Japan');
INSERT INTO MANUFACTURERS (name, country) VALUES ('BMW', 'Germany');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Mercedes-Benz', 'Germany');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Audi', 'Germany');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Volkswagen', 'Germany');
INSERT INTO MANUFACTURERS (name, country) VALUES ('Ford', 'United States');

-- 기존 데이터에 제조사 ID 연결 (선택사항)
UPDATE CARS SET manufacturer_id = 1 WHERE make = 'Tesla';  -- Tesla의 ID가 1이라고 가정