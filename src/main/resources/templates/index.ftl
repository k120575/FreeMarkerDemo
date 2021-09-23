<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GameBox</title>
</head>

<body>
    <h2>GameBox</h2>
    <div class="form-group">
        <div class="input-icon">
            <i class="icon-user">
            </i>
            <input type="text" name="id" id="id" class="form-control" placeholder="帳號"
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
        <button type="button" class="submit btn btn-primary pull-right" onclick="location.href='/TP3rd/register.html'">
            註冊
            <i class="icon-angle-right">
            </i>
        </button>
        <button type="submit" class="submit btn btn-primary pull-right" >
            登入
            <i class="icon-angle-right">
            </i>
        </button>
    </div>
</body>
</html>