const VISITED = 1;
const NOT_VISITED = 0;

/**
 * Try to find path from point [0,0] to [rows-1, columns-1] point with moving only down and right
 * @param {*} ROWS 
 * @param {*} COLUMNS
 */
function GridRobot( m,n) {
  const visited = Array.from(new Array(n), () =>
    new Array(m).fill(NOT_VISITED)
  );

  const isRestrictedField = (x, y) => x === 1 && y === 3;
  const isVisited = (x, y) => visited[y][x] === VISITED;
  const canMoveDown = (x, y) =>
    y + 1 < n && !isRestrictedField(x, y + 1) && !isVisited(x, y + 1);
  const canMoveRight = (x, y) =>
    x + 1 < m && !isRestrictedField(x + 1, y) && !isVisited(x + 1, y);
  const isFinished = (x, y) => x === m - 1 && y === n - 1;

  let prev = [];
  let pos = { x: 0, y: 0 };

  while (pos && !isFinished(pos.x, pos.y)) {
    let moveDown = canMoveDown(pos.x, pos.y);
    let moveRight = canMoveRight(pos.x, pos.y);

    if (!moveDown && !moveRight) {
      pos = prev.pop();
    } else {
      prev.push(Object.assign({}, pos));
      if (moveDown) {
        pos.y = pos.y + 1;
      } else if (moveRight) {
        pos.x = pos.x + 1;
      }
      visited[pos.y][pos.x] = VISITED;
    }
  }

  return visited;
}

let result = GridRobot(3, 4); 
