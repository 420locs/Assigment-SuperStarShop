create trigger create_order_state_after_insert on Orders
after insert
as
begin
	insert into [Order State] values((select top 1 id from inserted i order by id desc), 0)
end
