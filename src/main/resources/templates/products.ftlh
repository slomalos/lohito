<!DOCTYPE html>
<html>
<head>
    <title>
        Lohito
    </title>
</head>
<body>
<h1>
    Lohito</h1><hr>
<h4>
    Купи.Продай.Повтори.
</h4>
<#list products as product >
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Разместить объявление</h3>
<form action = "/product/create" method="post">
    Название объявления: <input type = "text" name="title"/><br><br>
    Описание объявления: <input type = "text" name="description"/><br><br>
    Цена: <input type = "number" name="price"/><br><br>
    Город: <input type = "text" name="city"/><br><br>
    <input type="submit" value="Разместить объявление"/>
</form>
</body>
</html>