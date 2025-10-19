create table if not exists namespace ();

insert into namespace() values ()
on conflict DO NOTHING;

create table if not exists table_info();

create index concurrently if not exists table_info_name_index on table_info ();
create index concurrently if not exists table_info_path_index on table_info ();

create table if not exists table_name_id();

create index concurrently if not exists table_name_id_id_index on table_name_id ();

create table if not exists table_path_id
(
);

create index concurrently if not exists table_path_id_id_index on table_name_id ();

DO
$$
    BEGIN
        IF NOT EXISTS (select 1 from pg_type where typname = 'data_file_op') THEN
            CREATE TYPE data_file_op AS
            (
                path text,
                file_op text,
                size bigint,
                file_exists_cols text
            );
            END IF;
    END
$$;

create table if not exits data_commit_info
(
);

create index concurrently if not exists data_commit_info_commit_id on data_commit_info ();

create table if not exits partition_info
(

);

create index concurrently if not exists partition_info_timestamp on partition_info();
create index concurrently if not exists partition_info_desc_gin_tsvector_index on partition_info() USING GIN ();

create or replace function partition_insert() returns trigger as
$$
$$ LANGUAGE plpgsql;

DROP trigger if exists partition_table_change on partition_info;
CREATE TRIGGER partition_table_change
    After insert
    on partition_info
    for each row
EXECUTE procedure partition_insert()

create table if not exists global_config();


create table if not exists discard_compressed_file_info();
