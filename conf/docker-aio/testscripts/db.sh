#!/bin/sh
<<<<<<< HEAD
psql -U postgres -c "CREATE ROLE dvnapp UNENCRYPTED PASSWORD 'secret' SUPERUSER CREATEDB CREATEROLE INHERIT LOGIN" template1
=======
psql -U postgres -c "CREATE ROLE dvnapp PASSWORD 'secret' SUPERUSER CREATEDB CREATEROLE INHERIT LOGIN" template1
>>>>>>> dataverse-5.3/master
psql -U dvnapp -c 'CREATE DATABASE "dvndb" WITH OWNER = "dvnapp"' template1
