/**
 * 画面上の特定のクラス（search-input）を持つ要素から検索条件を収集する。
 * この関数は、input[type='text']やinput[type='checkbox']などの要素を対象とする。
 * 使用例：
 *   <td style="min-width: 0px;"> 
 *     <input type='text' id="userName" maxlength="45" class="search-input">
 *   </td>
 * @returns {Object} 検索条件をキー（要素のID）と値のペアで含むオブジェクト。
 */
function collectSearchConditions() {
    return $(".search-input").map((_, element) => {
        return element.type === 'checkbox' ? {[element.id]: element.checked} : {[element.id]: element.value};
    }).get().reduce((searchConditions, condition) => {
        return {...searchConditions, ...condition};
    }, {});
}
