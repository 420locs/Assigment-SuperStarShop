create trigger update_units_null_to_zero on Products
after insert, update
as
begin
	update Products
	set units_in_stock = case when units_in_stock is null then 0 else units_in_stock end
end
