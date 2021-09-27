<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>GameBox登入</h2>
    <div class="container">
        <form id="login" name="login" action="/demo/login" method="post">
            <div class="form-group">
                <div class="input-icon">
                    <i class="icon-user">
                    </i>
                    <input type="text" name="name" id="name" class="form-control" placeholder="帳號"
                           autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入帳號。"
                    />
                </div>
            </div>
            <div class="form-group">
                <div class="input-icon">
                    <i class="icon-lock">
                    </i>
                    <input type="password" name="password" id="password" class="form-control" placeholder="密碼"
                           data-rule-required="true" data-msg-required="請輸入密碼。"
                    />
                </div>
            </div>
            <div class="form-actions">
                <button type="button" class="submit btn btn-primary pull-right" onclick="location.href='/demo/register'">
                    註冊
                    <i class="icon-angle-right">
                    </i>
                </button>
                <form action="/demo/login" method="post">
                    <input class="btn btn-primary btn-lg btn-block" type="submit" value="登入">
                </form>
            </div>
        </form>
    </div>
</body>
</html>