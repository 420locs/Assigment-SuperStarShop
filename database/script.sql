USE [master]
GO
/****** Object:  Database [SuperStarShopDB]    Script Date: 11/13/2020 10:07:35 PM ******/
CREATE DATABASE [SuperStarShopDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SuperStarShopDB', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\SuperStarShopDB.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'SuperStarShopDB_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\SuperStarShopDB_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [SuperStarShopDB] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SuperStarShopDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SuperStarShopDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SuperStarShopDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SuperStarShopDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET  ENABLE_BROKER 
GO
ALTER DATABASE [SuperStarShopDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SuperStarShopDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET RECOVERY FULL 
GO
ALTER DATABASE [SuperStarShopDB] SET  MULTI_USER 
GO
ALTER DATABASE [SuperStarShopDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SuperStarShopDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SuperStarShopDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SuperStarShopDB] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [SuperStarShopDB] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'SuperStarShopDB', N'ON'
GO
USE [SuperStarShopDB]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [nvarchar](36) NOT NULL,
	[password] [nvarchar](36) NOT NULL,
	[customer_id] [int] NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[customer_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Brands]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Brands](
	[id] [nvarchar](10) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Brands] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Cart]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[customer_id] [int] NOT NULL,
	[product_id] [int] NOT NULL,
	[size] [int] NOT NULL,
	[quantity] [int] NOT NULL,
 CONSTRAINT [PK_Cart] PRIMARY KEY CLUSTERED 
(
	[customer_id] ASC,
	[product_id] ASC,
	[size] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Customers]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customers](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](24) NOT NULL,
	[address] [nvarchar](50) NULL,
	[city] [nvarchar](20) NULL,
	[phone] [nvarchar](16) NULL,
	[email] [nvarchar](50) NULL,
	[picture] [ntext] NULL,
 CONSTRAINT [PK_Customers] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Order Details]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order Details](
	[order_id] [int] NOT NULL,
	[product_id] [int] NOT NULL,
	[unit_price] [money] NOT NULL,
	[quantity] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[order_id] ASC,
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Order State]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order State](
	[order_id] [int] NOT NULL,
	[has_processed] [bit] NOT NULL,
 CONSTRAINT [PK_Order State] PRIMARY KEY CLUSTERED 
(
	[order_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Orders]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customer_id] [int] NULL,
	[order_date] [datetime] NOT NULL,
	[address] [nvarchar](50) NOT NULL,
	[city] [nvarchar](20) NULL,
	[phone] [nvarchar](16) NOT NULL,
	[note] [nvarchar](200) NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Products]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](100) NULL,
	[brand_id] [nvarchar](10) NULL,
	[price] [money] NOT NULL,
	[units_in_stock] [int] NULL,
	[order_level] [int] NOT NULL,
	[view] [int] NOT NULL,
	[discount] [float] NULL,
	[description] [ntext] NULL,
	[picture] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Sizes]    Script Date: 11/13/2020 10:07:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sizes](
	[size] [float] NOT NULL,
	[shoe_id] [int] NOT NULL,
	[units_in_stock] [int] NOT NULL,
 CONSTRAINT [PK_Sizes] PRIMARY KEY CLUSTERED 
(
	[size] ASC,
	[shoe_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Account] ([username], [password], [customer_id]) VALUES (N'minh', N'123', 2)
GO
INSERT [dbo].[Account] ([username], [password], [customer_id]) VALUES (N'bac', N'123', 3)
GO
INSERT [dbo].[Account] ([username], [password], [customer_id]) VALUES (N'ninh', N'123', 6)
GO
INSERT [dbo].[Account] ([username], [password], [customer_id]) VALUES (N'khanhpd', N'123', 25)
GO
INSERT [dbo].[Brands] ([id], [name]) VALUES (N'AD', N'Adidas')
GO
INSERT [dbo].[Brands] ([id], [name]) VALUES (N'BT', N'Bitis''s Hunter')
GO
INSERT [dbo].[Brands] ([id], [name]) VALUES (N'CV', N'Converse')
GO
INSERT [dbo].[Brands] ([id], [name]) VALUES (N'ELSE', N'')
GO
INSERT [dbo].[Brands] ([id], [name]) VALUES (N'NK', N'Nike')
GO
INSERT [dbo].[Brands] ([id], [name]) VALUES (N'VA', N'Vans')
GO
INSERT [dbo].[Cart] ([customer_id], [product_id], [size], [quantity]) VALUES (6, 1, 37, 1)
GO
INSERT [dbo].[Cart] ([customer_id], [product_id], [size], [quantity]) VALUES (6, 3, 40, 2)
GO
INSERT [dbo].[Cart] ([customer_id], [product_id], [size], [quantity]) VALUES (25, 3, 41, 1)
GO
SET IDENTITY_INSERT [dbo].[Customers] ON 

GO
INSERT [dbo].[Customers] ([id], [name], [address], [city], [phone], [email], [picture]) VALUES (1, N'khác', N'', N'', N'', N'', N'')
GO
INSERT [dbo].[Customers] ([id], [name], [address], [city], [phone], [email], [picture]) VALUES (2, N'Hoàng Duy Minh', N'Hoàn Kiếm', N'Hà Nội', N'', N'', N'')
GO
INSERT [dbo].[Customers] ([id], [name], [address], [city], [phone], [email], [picture]) VALUES (3, N'Đỗ Văn Bắc', NULL, N'Hưng Yên', N'', N'', N'')
GO
INSERT [dbo].[Customers] ([id], [name], [address], [city], [phone], [email], [picture]) VALUES (4, N'Phạm Tiến Đạt', NULL, N'Thái Nguyên', N'', N'', N'')
GO
INSERT [dbo].[Customers] ([id], [name], [address], [city], [phone], [email], [picture]) VALUES (6, N'Trịnh Bá Minh Ninh', N'Chương Mỹ', N'Hà Nội', N'+84369543469', N'sogorosanza@gmail.com', N'')
GO
INSERT [dbo].[Customers] ([id], [name], [address], [city], [phone], [email], [picture]) VALUES (25, N'Pham Duy Khanh', N'', N'', N'', N'', N'')
GO
SET IDENTITY_INSERT [dbo].[Customers] OFF
GO
SET IDENTITY_INSERT [dbo].[Products] ON 

GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (1, N'POD-S3.1 W Core Black/Maroon', N'AD', 2350000.0000, 121, 0, 8, 34, N'', N'https://deestore.vn/wp-content/uploads/2020/02/POD_S3.1_Shoes_Black_CG6183_01_standard-768x768.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (2, N'Coast Star Shoes BLACK/WHITE', N'AD', 2250000.0000, 110, 0, 2, 44, N'', N'https://deestore.vn/wp-content/uploads/2020/03/2e5f6e2690cebabba1fed8506c67aa71-768x768.jpeg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (3, N'X - Summer 2k19 BKL', N'BT', 799000.0000, 100, 1, 44, 0, N'', N'https://product.hstatic.net/1000230642/product/dsmh01000den__3__388006adc4e94310bd0c4b226898dde9_1024x1024.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (4, N'BST HaNoi Culture Patchwork Old Wall Yellow', N'BT', 899000.0000, 100, 0, 7, 0, N'', N'https://product.hstatic.net/1000230642/product/9_4af2a89ef6a8461184dda8b5339a0787_1024x1024.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (5, N'Street Mid Americano ', N'BT', 729000.0000, 100, 1, 26, 0, N'', N'https://product.hstatic.net/1000230642/product/dsmh03600__4__635fba02a403477fb8f869446669629e_1024x1024.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (6, N'Chuck Taylor All Star Hi-Top Classic ', N'CV', 1500000.0000, 110, 0, 53, 10, N'Khác với cổ thấp, phiên bản cổ cao của dòng Converse Classic mang đến cho bạn sự trẻ trung và đầy cá tính. Với tông màu đen - trắng quen thuộc cùng logo Chuck Taylor All Star nằm bên hông thân giày mang đến sự nổi bật cho người mang. Đặc biệt là khả năng mix&match cực phong cách. Vì vậy đây là dòng luôn được restock liên tục tại cửa hàng Super Star.', N'https://drake.vn/image/cache/catalog/Converse/Classic/Hi%CC%80nh%20chu%CC%89/121186-DRAKE-650x650.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (7, N'Chuck Taylor All Star Classic ', N'CV', 1400000.0000, 100, 0, 6, 10, N'Phiên bản màu đen của Converse Classic cổ thấp chắc chắn là item đơn giản phù hợp với mọi phong cách đáng để bạn sở hữu. Với thiết kế cổ điển được ưa chuộng của dòng Classic đi kèm với chất liệu vải Canvas mềm nhẹ, phần để cao su bền chắc cùng đường viền đen đặc trưng, tin chắc đây sẽ là item giúp cho các set đồ của bạn trở nên đầy phong cách.', N'https://drake.vn/image/cache/catalog/Converse/Classic/Hi%CC%80nh%20chu%CC%89/121178-DRAKE-650x650.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (8, N'AIR FORCE 1 LOW', N'NK', 2550000.0000, 110, 0, 4, 24, N'', N'https://deestore.vn/wp-content/uploads/2019/05/air-force-1-big-kids-shoe-yjJZRo-4-768x960.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (9, N'Jordan 1 Mid SE Union Royal', N'NK', 4900000.0000, 110, 0, 0, 15, N'', N'https://deestore.vn/wp-content/uploads/2020/09/air-jordan-1-mid-se-mens-shoe-P7bjRV-3-768x960.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (10, N'Old Skool', N'VA', 1750000.0000, 110, 0, 0, 10, N'Thiết kế Vans Old Skool Classic trắng đen kinh điển, sử dụng kết hợp chất liệu vải Canvas mềm, nhẹ ở thân giày và chất liệu da lộn ở mũi giày và đế giày mang đến cho bạn sự thoải mái khi di chuyển. Đế cao su chuyên dùng cho bộ môn trượt ván đảm bảo độ bền chắc và có độ bám tốt. Khả năng kết hợp nhiều outfit mà không sợ bị lệch tông.', N'https://drake.vn/image/cache/catalog/Vans/D3HY28-650x650.jpg')
GO
INSERT [dbo].[Products] ([id], [name], [brand_id], [price], [units_in_stock], [order_level], [view], [discount], [description], [picture]) VALUES (11, N'Old Skool Checkerboard', N'VA', 1750000.0000, 110, 0, 0, 10, N'Mẫu giày Vans Old Skool Checkerboard được cách điệu từ dòng Classic với đường viền da trắng tạo nên phong cách mới mẻ nhưng vẫn rất dễ phối đồ. Thêm vào đó là họa tiết kinh điển Checkerboard của nhà Vans đã khiến đôi giày tăng thêm nghìn lần sức hút.', N'https://drake.vn/image/cache/catalog/Vans/SNEAKER/H%C3%ACnh%20Trang%20Ch%E1%BB%A7/VN0A38G1P0S-DRAKE-650x650.jpg')
GO
SET IDENTITY_INSERT [dbo].[Products] OFF
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (36.5, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (37.5, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (38, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (39.5, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (40, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (41.5, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (42, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (43, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 1, 11)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 2, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 5, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 6, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 7, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 8, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 9, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 10, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (44, 11, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (45, 3, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (45, 4, 10)
GO
INSERT [dbo].[Sizes] ([size], [shoe_id], [units_in_stock]) VALUES (45, 5, 10)
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [IX_Account]    Script Date: 11/13/2020 10:07:35 PM ******/
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [IX_Account] UNIQUE NONCLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_Account_Customers] FOREIGN KEY([customer_id])
REFERENCES [dbo].[Customers] ([id])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_Account_Customers]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_Cart_Customers] FOREIGN KEY([customer_id])
REFERENCES [dbo].[Customers] ([id])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_Cart_Customers]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_Cart_Products] FOREIGN KEY([product_id])
REFERENCES [dbo].[Products] ([id])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_Cart_Products]
GO
ALTER TABLE [dbo].[Order Details]  WITH CHECK ADD  CONSTRAINT [FK_Order Details_Orders] FOREIGN KEY([order_id])
REFERENCES [dbo].[Orders] ([id])
GO
ALTER TABLE [dbo].[Order Details] CHECK CONSTRAINT [FK_Order Details_Orders]
GO
ALTER TABLE [dbo].[Order Details]  WITH CHECK ADD  CONSTRAINT [FK_Order Details_Shoes] FOREIGN KEY([product_id])
REFERENCES [dbo].[Products] ([id])
GO
ALTER TABLE [dbo].[Order Details] CHECK CONSTRAINT [FK_Order Details_Shoes]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Customers] FOREIGN KEY([customer_id])
REFERENCES [dbo].[Customers] ([id])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Customers]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Order State] FOREIGN KEY([id])
REFERENCES [dbo].[Order State] ([order_id])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Order State]
GO
ALTER TABLE [dbo].[Products]  WITH CHECK ADD  CONSTRAINT [FK_Shoes_Brands] FOREIGN KEY([brand_id])
REFERENCES [dbo].[Brands] ([id])
GO
ALTER TABLE [dbo].[Products] CHECK CONSTRAINT [FK_Shoes_Brands]
GO
ALTER TABLE [dbo].[Sizes]  WITH CHECK ADD  CONSTRAINT [FK_Sizes_Products] FOREIGN KEY([shoe_id])
REFERENCES [dbo].[Products] ([id])
GO
ALTER TABLE [dbo].[Sizes] CHECK CONSTRAINT [FK_Sizes_Products]
GO
USE [master]
GO
ALTER DATABASE [SuperStarShopDB] SET  READ_WRITE 
GO
