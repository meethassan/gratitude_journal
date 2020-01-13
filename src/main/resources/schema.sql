create table gratitude_journal
(
	id long auto_increment,
	grateful_for varchar not null,
	created_at timestamp default current_timestamp not null
);

create unique index gratitude_journal_id_uindex
	on gratitude_journal (id);

alter table gratitude_journal
	add constraint gratitude_journal_pk
		primary key (id);

