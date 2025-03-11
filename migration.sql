\connect omdb;

set search_path = 'public';

alter table casts
    drop constraint casts_pkey;

alter table casts
    ADD COLUMN id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY;

alter table people_aliases
    drop constraint people_aliases_pkey;

alter table people_aliases
    ADD COLUMN id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY;

