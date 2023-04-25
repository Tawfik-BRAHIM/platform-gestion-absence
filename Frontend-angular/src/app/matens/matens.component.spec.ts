import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatensComponent } from './matens.component';

describe('MatensComponent', () => {
  let component: MatensComponent;
  let fixture: ComponentFixture<MatensComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MatensComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatensComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
