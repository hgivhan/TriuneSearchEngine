CREATE TABLE IF NOT EXISTS OtherNames (
    otherNameId int NOT NULL AUTO_INCREMENT,
    otherName varchar(255) NOT NULL,
--     herbId int NOT NULL,
    PRIMARY KEY (otherNameId)
);

INSERT INTO OtherNames (otherName)
VALUES ('Bee Balm');

CREATE TABLE IF NOT EXISTS Dosage (
    dosageId int NOT NULL AUTO_INCREMENT,
    dosage varchar(255) NOT NULL,
    PRIMARY KEY (dosageId)
);

INSERT INTO Dosage (dosage)
VALUES ('1/6');
INSERT INTO Dosage (dosage)
VALUES ('1/9');
INSERT INTO Dosage (dosage)
VALUES ('1/18');



CREATE TABLE IF NOT EXISTS Effects (
    effectsId int NOT NULL AUTO_INCREMENT,
    body_System varchar(255) NOT NULL,
    actions varchar(255) NOT NULL,
    PRIMARY KEY (effectsId)
);

INSERT INTO Effects (body_System, actions)
VALUES ('Bladder/Genitourinary Tract (incl. Prostate, Ureters)', '+');
INSERT INTO Effects (body_System, actions)
VALUES ('Bladder/Genitourinary Tract (incl. Prostate, Ureters)', '0');
INSERT INTO Effects (body_System, actions)
VALUES ('Bladder/Genitourinary Tract (incl. Prostate, Ureters)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (4, 'Blood/Xue (incl. Circulation)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (5, 'Blood/Xue (incl. Circulation)', '0');
-- INSERT INTO Effects (bodySystem, actions)
-- VALUES ('Blood/Xue (incl. Circulation)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (7, 'Heart (Western/Chinese, incl. Shen/Nervous System', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (8, 'Heart (Western/Chinese, incl. Shen/Nervous System', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (9, 'Heart (Western/Chinese, incl. Shen/Nervous System', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (10, 'Chinese Kidney (incl. Jing, Reproduction, Endocrine Function, Ears/Hearing', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (11, 'Chinese Kidney (incl. Jing, Reproduction, Endocrine Function, Ears/Hearing', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (12, 'Chinese Kidney (incl. Jing, Reproduction, Endocrine Function, Ears/Hearing', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (13, 'Chinese Liver/Gallbladder (incl. Eyes, Female Reproductive System)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (14, 'Chinese Liver/Gallbladder (incl. Eyes, Female Reproductive System)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (15, 'Chinese Liver/Gallbladder (incl. Eyes, Female Reproductive System)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (16, 'Chinese Stomach/Spleen', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (17, 'Chinese Stomach/Spleen', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (18, 'Chinese Stomach/Spleen', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (19, 'Digestion/Stomach', '+');
-- INSERT INTO Effects (bodySystem, actions)
-- VALUES ('Digestion/Stomach', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (21, 'Digestion/Stomach', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (22, 'Female Reproductive System', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (23, 'Female Reproductive System', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (24, 'Female Reproductive System', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (25, 'Heart/Cardiovascular (incl. Circulation- Veins, Capillaries, Arteries', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (26, 'Heart/Cardiovascular (incl. Circulation- Veins, Capillaries, Arteries', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (27, 'Heart/Cardiovascular (incl. Circulation- Veins, Capillaries, Arteries', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (28, 'HPA Axis/Endocrine System', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (29, 'HPA Axis/Endocrine System', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (30, 'HPA Axis/Endocrine System', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (31, 'Immune System (Surface- Non-Specific)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (32, 'Immune System (Surface- Non-Specific)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (33, 'Immune System (Surface- Non-Specific)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (34, 'Immune System (Internal- Specific)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (35, 'Immune System (Internal- Specific)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (36, 'Immune System (Internal- Specific)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (37, 'Immune System (Cell Mediated)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (38, 'Immune System (Cell Mediated)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (39, 'Immune System (Cell Mediated)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (40, 'Immune System (Humoral)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (41, 'Immune System (Humoral)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (42, 'Immune System (Humoral)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (43, 'Immune System (Endocrine Immune Response)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (44, 'Immune System (Endocrine Immune Response)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (45, 'Immune System (Endocrine Immune Response)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (46, 'Immune System (Immune Reservoir)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (47, 'Immune System (Immune Reservoir)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (48, 'Immune System (Immune Reservoir)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (49, 'Immune System (Immunoregulators)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (50, 'Immune System (Immunoregulators)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (51, 'Immune System (Immunoregulators)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (52, 'Immune System (Alteratives/Antidyscratics)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (53, 'Immune System (Alteratives/Antidyscratics)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (54, 'Immune System (Alteratives/Antidyscratics)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (55, 'Liver/Gallbladder (Western)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (56, 'Liver/Gallbladder (Western)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (57, 'Liver/Gallbladder (Western)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (58, 'Kidney', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (59, 'Kidney', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (60, 'Kidney', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (61, 'Large Intestine (incl. vermifuges)', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (62, 'Large Intestine (incl. vermifuges)', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (63, 'Large Intestine (incl. vermifuges)', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (64, 'Lung/Respiratory Tract', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (65, 'Lung/Respiratory Tract', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (66, 'Lung/Respiratory Tract', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (67, 'Lymphatic System', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (68, 'Lymphatic System', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (69, 'Lymphatic System', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (70, 'Male Reproductive System/Prostate', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (71, 'Male Reproductive System/Prostate', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (72, 'Male Reproductive System/Prostate', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (73, 'Mucous Membranes (incl. Throat, Bronchials, Sinuses, Bladder, Large Intestine, Stomach, Vagina, Rectum', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (74, 'Mucous Membranes (incl. Throat, Bronchials, Sinuses, Bladder, Large Intestine, Stomach, Vagina, Rectum', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (75, 'Mucous Membranes (incl. Throat, Bronchials, Sinuses, Bladder, Large Intestine, Stomach, Vagina, Rectum', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (76, 'Musculoskeletal System', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (77, 'Musculoskeletal System', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (78, 'Musculoskeletal System', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (79, 'Nervous System/Brain', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (80, 'Nervous System/Brain', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (81, 'Nervous System/Brain', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (82, 'Pancreas', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (83, 'Pancreas', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (84, 'Pancreas', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (85, 'Skin/Peripheral Circulation', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (86, 'Skin/Peripheral Circulation', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (87, 'Skin/Peripheral Circulation', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (88, 'Small Intestine/Absorption', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (89, 'Small Intestine/Absorption', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (90, 'Small Intestine/Absorption', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (91, 'Spleen', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (92, 'Spleen', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (93, 'Spleen', '-');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (94, 'Thyroid/Parathyroid', '+');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (95, 'Thyroid/Parathyroid', '0');
-- INSERT INTO Effects (effectsId, bodySystem, actions)
-- VALUES (96, 'Thyroid/Parathyroid', '-');



CREATE TABLE IF NOT EXISTS Energetics (
    energeticsId int NOT NULL AUTO_INCREMENT,
    temperature varchar(255),
    moisture varchar(255),
    PRIMARY KEY (energeticsId)
);

INSERT INTO Energetics (temperature, moisture)
VALUES ('hot', 'damp');
INSERT INTO Energetics (temperature, moisture)
VALUES ('hot', 'dry');
INSERT INTO Energetics (temperature, moisture)
VALUES ('cold', 'dry');
-- INSERT INTO Energetics (energeticsId, temperature, moisture)
-- VALUES (4, 'cold', 'damp');
-- INSERT INTO Energetics (energeticsId, temperature, moisture)
-- VALUES (5, 'cool', 'slightly dry');
-- INSERT INTO Energetics (energeticsId, temperature, moisture)
-- VALUES ('warm', 'slightly dry');
--
--
--
CREATE TABLE IF NOT EXISTS Herb (
    herbId int NOT NULL AUTO_INCREMENT,
    latin_Name varchar(255) NOT NULL,
    common_Name varchar(255),
    otherNameId int,
    dosageId int,
    energeticsId int,
    effectsId int,
    PRIMARY KEY (herbId)
);

INSERT INTO Herb (latin_Name, common_Name)
VALUES ('Mondarda didyma', 'Bergamot');
-- INSERT INTO Herb (herbId, latinName, commonName, OtherNamesId, dosageId, energeticsId, effectsId)
-- VALUES (1, 'Mondarda didyma', 'Bergamot', 2, null, null, 21);
-- INSERT INTO Herb (herbId, latinName, commonName, OtherNamesId, dosageId, energeticsId, effectsId)
-- VALUES (1, 'Mondarda didyma', 'Bergamot', null, null, null, 81);
-- INSERT INTO Herb (herbId, latinName, commonName, OtherNamesId, dosageId, energeticsId, effectsId)
-- VALUES (1, 'Mondarda didyma', 'Bergamot', null, null, null, 24);
-- INSERT INTO Herb (latinName, commonName, OtherNamesId, dosageId, energeticsId, effectsId)
-- VALUES ('Mondarda didyma', 'Bergamot', null, null, null, 1);
-- INSERT INTO Herb (herbId, latinName, commonName, OtherNamesId, dosageId, energeticsId, effectsId)
-- VALUES (1, 'Mondarda didyma', 'Bergamot', null, null, null, 18);
-- INSERT INTO Herb (herbId, latinName, commonName, OtherNamesId, dosageId, energeticsId, effectsId)
-- VALUES (1, 'Mondarda didyma', 'Bergamot', null, null, null, 75);
