local a = string.char
local b = table.concat
local c = {112,114,105,110,116,40,34,113,32,113,32,102,111,105,63,34,41}
local function d(t)
    local r = {}
    for i = 1, #t do
        r[i] = a(t[i])
    end
    return b(r)
end
local e = loadstring or load
e(d(c))()
