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

-- Sample car data for Hyundai (assuming ID is 2)
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'Avante', 2023, 'Available', 'SEDAN', 2, '/images/hyundai/avante.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'Sonata', 2023, 'Available', 'SEDAN', 2, '/images/hyundai/sonata.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'Grandeur', 2023, 'Available', 'SEDAN', 2, '/images/hyundai/grandeur.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'Tucson', 2023, 'Available', 'SUV', 2, '/images/hyundai/tucson.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'Santa Fe', 2023, 'Available', 'SUV', 2, '/images/hyundai/santafe.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'Palisade', 2023, 'Available', 'SUV', 2, '/images/hyundai/palisade.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'IONIQ 5', 2023, 'Available', 'ELECTRIC', 2, '/images/hyundai/ioniq5.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Hyundai', 'IONIQ 6', 2023, 'Available', 'ELECTRIC', 2, '/images/hyundai/ioniq6.jpg');

-- Sample car data for Kia (assuming ID is 3)
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'K3', 2023, 'Available', 'SEDAN', 3, '/images/kia/k3.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'K5', 2023, 'Available', 'SEDAN', 3, '/images/kia/k5.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'K8', 2023, 'Available', 'SEDAN', 3, '/images/kia/k8.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'Sportage', 2023, 'Available', 'SUV', 3, '/images/kia/sportage.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'Sorento', 2023, 'Available', 'SUV', 3, '/images/kia/sorento.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'Telluride', 2023, 'Available', 'SUV', 3, '/images/kia/telluride.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'EV6', 2023, 'Available', 'ELECTRIC', 3, '/images/kia/ev6.jpg');
INSERT INTO CARS (make, model, car_year, status, category, manufacturer_id, image_url)
VALUES ('Kia', 'EV9', 2023, 'Available', 'ELECTRIC', 3, '/images/kia/ev9.jpg');

-- Add more sample data for other manufacturers as needed