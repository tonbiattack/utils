/**
 * APIへのHTTPリクエストを実行し、応答を取得する。
 * @param {string} url - リクエストするAPIのURL。
 * @param {Object} [params={}] - GETリクエストに含めるクエリパラメータ。
 * @param {Object} [options={}] - $.ajaxに渡す追加のオプション。
 * @returns {Promise<Object>} - API応答を含むプロミス。エラーが発生した場合は拒否される。
 */
function fetchApiResponse(url, params = {}, options = {}) {
    return new Promise((resolve, reject) => {
        $.ajax({
            ...{
                url,
                cache: false,
                contentType: 'application/json; charset=UTF-8',
                dataType: 'json',
                type: 'GET',
                data: params,
                success: (res) => {
                    if (res.error) {
                        sendToErrorPage(res);
                        reject(new Error('API Response Error'));
                    } else {
                        resolve(res);
                    }
                },
                error: (XMLHttpRequest, textStatus, errorThrown) => {
                    sendToHttpErrorPage(XMLHttpRequest, textStatus, errorThrown);
                    reject(new Error(`HTTP Request Error: ${textStatus}`));
                }
            },
            ...options
        });
    });
}
