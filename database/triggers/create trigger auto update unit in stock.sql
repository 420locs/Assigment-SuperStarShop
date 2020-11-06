create trigger update_units_in_stock on Sizes
after update, insert, delete
as
begin
	update Products
	set units_in_stock = (select sum(case when s.units_in_stock is null then 0 else s.units_in_stock end)  from Sizes s where s.shoe_id = Products.id )
end