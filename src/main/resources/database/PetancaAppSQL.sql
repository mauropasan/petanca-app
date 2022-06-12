CREATE DATABASE IF NOT EXISTS `PetancaApp`;
USE `PetancaApp`;

CREATE TABLE IF NOT EXISTS `PetancaApp`.`Users` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `password` VARCHAR(45) NULL,
    `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `PetancaApp`.`Teams` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `played` INT NOT NULL DEFAULT 0,
    `win` INT NOT NULL DEFAULT 0,
    `draw` INT NOT NULL DEFAULT 0,
    `loss` INT NOT NULL DEFAULT 0,
    `goal_for` INT NOT NULL DEFAULT 0,
    `goal_against` INT NOT NULL DEFAULT 0,
    `points` INT NOT NULL DEFAULT 0,
    `coefficient` FLOAT NOT NULL DEFAULT 0,
    `members` VARCHAR(45) NULL,
    `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `PetancaApp`.`SplitShifts` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `number` INT NOT NULL,
    PRIMARY KEY (`id`));