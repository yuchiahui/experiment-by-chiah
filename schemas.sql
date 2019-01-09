-- Database: "Chiah"

-- DROP DATABASE "Chiah";

CREATE DATABASE "Chiah"
  WITH OWNER = "Chiah"
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       CONNECTION LIMIT = -1;

---------------------------------------------------------- 
CREATE TABLE "public"."teacher" (
	"id" smallserial PRIMARY KEY,
	"name" varchar NOT NULL
);
	
----------------------------------
CREATE TABLE "public"."student" (
	"id" serial PRIMARY KEY,
	"name" varchar NOT NULL
);

----------------------------------
CREATE TABLE "public"."clazz" (
	"id" bigserial PRIMARY KEY,
	"teacher" smallint NOT NULL REFERENCES "teacher"("id") ON UPDATE CASCADE ON DELETE RESTRICT,
	"student" int NOT NULL REFERENCES "student"("id") ON UPDATE CASCADE ON DELETE RESTRICT
);