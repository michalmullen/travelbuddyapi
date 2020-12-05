CREATE TABLE "user" (
  "id" int PRIMARY KEY,
  "first_name" varchar,
  "last_name" varchar,
  "profile_pic" varchar,
  "gender" char,
  "positive_ref" int,
  "negative_ref" int,
  "last_login" date,
  "bio" text
);

CREATE TABLE "language" (
  "id" int PRIMARY KEY,
  "name" varchar
);

CREATE TABLE "user_language" (
  "user_id" int,
  "language_id" int,
  PRIMARY KEY ("user_id", "language_id")
);

CREATE TABLE "trip_type" (
  "id" int PRIMARY KEY,
  "name" varchar
);

CREATE TABLE "user_fav_trip_type" (
  "user_id" int,
  "trip_id" int,
  PRIMARY KEY ("user_id", "trip_id")
);

CREATE TABLE "trip" (
  "id" int PRIMARY KEY,
  "host" int,
  "description" text,
  "long" double,
  "lat" double,
  "start" datetime,
  "end" datetime,
  "budget" int,
  "currency" varchar
);

CREATE TABLE "trip_attendees" (
  "trip_id" int,
  "attendees_id" int,
  PRIMARY KEY ("trip_id", "attendees_id")
);

ALTER TABLE "user_language" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user_language" ADD FOREIGN KEY ("language_id") REFERENCES "language" ("id");

ALTER TABLE "user_fav_trip_type" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user_fav_trip_type" ADD FOREIGN KEY ("trip_id") REFERENCES "trip_type" ("id");

ALTER TABLE "trip" ADD FOREIGN KEY ("host") REFERENCES "user" ("id");

ALTER TABLE "trip_attendees" ADD FOREIGN KEY ("trip_id") REFERENCES "trip" ("id");

ALTER TABLE "trip_attendees" ADD FOREIGN KEY ("attendees_id") REFERENCES "user" ("id");